$(document).ready(function(){
  $("a").click(function(){
  var title = $(this).attr("aria-label");
    alert(title + " Message was sent to the area");
  });
});