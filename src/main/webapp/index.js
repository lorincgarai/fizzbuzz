var fizzBuzzUrl = window.location.href + "getfizzbuzz";

function getFizzBuzz()
{
      $.get(fizzBuzzUrl,function(response, status) {
                for (itemno in response)
                {
                    $("#response").append(response[itemno] + "<BR>");
                }
            }
        );
}

function reset()
{
    $("#response").html("");
}
