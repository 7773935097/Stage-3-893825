$(document).ready(() => {
  var pTags = $("p");
  $("#wrapUnwrap").click(function () {
    if (pTags.parent().is("div")) {
      pTags.unwrap();
    } else {
      pTags.wrap("<div>");
    }
  });
});