$(document).ready(function()
           {
          
               $("#btn").click(function()
               {
                   var a = $("#num1").val();
                   var b = $("#num2").val();

                   if(a=="" || b=="")
                   {
                      $("div").html( "Pls. Enter the Values").css("color","red");
                      
                   }
                   else
                   {
                   var res = parseInt(a) + parseInt(b);
                    $("div").html(res).css("color","rgb(4, 155, 4)");
                   $("#result").val(res);
                   }
                  
                  
                   
               })
           })