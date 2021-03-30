$(document).ready(function()
{
    $("#search").click(function()
    {   
        var ser= $("#txt1").val();
        var ar= ser.split(",");
        var ans=""
        var main= $("#txt2").val();
        var txt2= main.split(/\n/);
       
       
        for(var i=0;i<txt2.length;i++){
            for(var j=0;j<ar.length;j++){
                if(txt2[i].includes(ar[j])){
                    var first=""
                    var second=""
                    var sp=txt2[i].split(ar[j])
                    first=sp[0]
                    second=sp[1]
                    ans+=first+"<b>"+ar[j]+"</b>"+second+", "

                }

            }
        }
        $("#txt3").val(ans)
    })
    
});