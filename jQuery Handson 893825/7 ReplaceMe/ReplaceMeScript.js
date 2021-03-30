$(document).ready(() => {
  $("#btn").click(() => {
    var textArea = $("#myTextArea").val();
    console.log(textArea);
    $("#message").append(textArea);
  });

  $("#message").click(function () {
    console.log("Clicked on message");
    let emoji = document.createElement("img");
    emoji.src =
      "https://images.emojiterra.com/google/android-oreo/512px/1f642.png";
    emoji.width = 50;
    emoji.height = 50;
    $(this).replaceWith(emoji);
  });
});