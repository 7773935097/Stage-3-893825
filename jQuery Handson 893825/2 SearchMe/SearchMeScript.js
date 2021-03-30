$(document).ready(function()
            {
                $("span").mousemove(function()
                {
                
                    if($(this).text().startsWith("th"))
                    {
                        $(this).css({
                                "font-style":"italic","text-shadow":"2px 2px pink","font-weight":"Bold"
                            })
                    }
                })

                $( "span" ).on( "mouseover", function() 
                {
                     $( this ).css( "background-color", "bisque" );
                });
            })
