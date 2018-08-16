//количество статей на странице
var numberOfArticlePerPage = 6;
//количество страниц
var totalPages = (numberOfArticle % numberOfArticlePerPage === 0) ? numberOfArticle / numberOfArticlePerPage : numberOfArticle / numberOfArticlePerPage + 1;
//порядок сортировки(ASC-прямая, DESC-обратная)
var order = "DESC";
//поле для сортировки
var orderBy = "publishedDate";
//номер текущей страницы
var currentPage = 0;

$(function () {
    var obj = $('#pagination').twbsPagination({
        totalPages: totalPages,
        visiblePages: (totalPages > 10) ? 10 : totalPages,
        onPageClick: function (event, page) {
            currentPage = page - 1;
            if (totalPages > 0) {
                loadListOfArticle();
            }
        }
    });
});

//функция для размещения полученных данных на странице
function renderingListOfArticle(listOfArticle) {

    $("#list-of-article").empty();

    listOfArticle.forEach(function (article) {
        //Шаблон для размещения объявления в списке
        var articleBody = "<a href=" + contextPath + "/list-of-article/article/" + article["id"] + " class='article-href list-group-item list-group-item-action flex-column align-items-start d-inline-flex p-2 bd-highlight' style='width: 537px;'>"
            + "<div class='d-flex w-100 justify-content-between'>"
            + "<h5 class='mb-1 article-name'>" + article["name"] + "</h5>"
            + "<small class='category-name'>" + article["category"].name + "</small>"
            + "<small class='published-date'>" + article["publishedDate"] + "</small>"
            + "</div>"
            + "<p class='mb-1 article-content'>" + article["content"].substring(0, 110) + "..." + "</p>"
            + "<small class='author'>" + article["author"].name + "</small>"
            + "</a>";
        $(articleBody).appendTo("#list-of-article");
    });
}

//функция для осуществления асинхронного GET запроса
function loadListOfArticle() {
    //формирование строки с данными, которые необходимо передать на сервер в метод listAjax
    var data = "currentPage=" + currentPage + "&" + "order=" + order + "&" + "orderBy=" + orderBy + "&" + "numberOfArticlePerPage=" + numberOfArticlePerPage;

    $.ajax({
        url: url,
        type: 'GET',
        data: data,
        cache: false,
        success: function (listOfArticleResponsive) {
            if (!listOfArticleResponsive) {
            } else {
                //если ответ содержит данные, то они размещаются на странице
                renderingListOfArticle(listOfArticleResponsive["listOfArticle"]);
            }
        }
    });
}