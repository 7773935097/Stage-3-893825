$(document).ready(function() 
                {
                    $("button").click(function() {
                            // If something is written
                        if ($('#textbox').val().length != 0) 
                            {
                                //Store previous activity
                                var a1 = $("#message").html();

                                // Add activity
                                var a2 = `<div class="alert alert-success alert-dismissible fade in">
                                <a href="#" class="close" data-dismiss="alert" aria-label="close"></a>
                            ` + $('#textbox').val() + `</div>`;

                                //add second activity below the first activity
                                $("#message").html(a1 + a2);
                                $('#textbox').val("");
                            } 
                            else 
                            {
                                // text box empty show alert
                                alert("Enter task details!!");
                            }
                        });
                    });

