$(function () {
    // 点击搜索框
    $(".but_search").click(function () {
        var str = $(".commodity").val();
        if(str.trim()==""||str==null){
            location.href="bookServlet?action=page";
        }else {
            location.href="bookServlet?action=pageByCommodity&commodity="+str;
        }

    });
    //点击我的购物车
    $(".shopcar").click(function () {
            location.href="pages/shopCar/shopCar.jsp";
    });
})