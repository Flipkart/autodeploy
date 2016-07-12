/**
 *  Created by Shuhail Kadavath
 */


$(document).ready(function() {
		//alert("here");
        $('#userName').blur(function(event) {
                var name = $('#userName').val();
                //alert("${pageContext.request.contextPath}");
                $.get("/AutoDeploy/GetUserServlet", {
                        userName : name
                }, function(responseText) {
                        $('#ajaxGetUserServletResponse').text(responseText);
                });
        });
});