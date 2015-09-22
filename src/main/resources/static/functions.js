$(document).ready(
	function(){
		console.log("ready!");
		$("#hello").click(function() {
			$.ajax({
			url:"hello-world?name=Toto",
			method:"GET",
				success:function(data) {
					$("#hello").html(data.content);
				}
			});
		});
	}
);

function diablo(){
		console.log("MDR DIABLO");
	};
	
function hearthstone(){
		console.log("MDR HEARTHSTONE");
	};