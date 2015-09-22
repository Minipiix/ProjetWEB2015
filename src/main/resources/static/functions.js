$(document).ready(
	function(){
		console.log("ready!");
		$("#hello").click(hello);
		$("#diabloButton").click(diablo);
		$("#hearthstoneButton").click(hearthstone);
	}
);

function diablo(){
		console.log("MDR DIABLO");
	};
	
function hearthstone(){
		console.log("MDR HEARTHSTONE");
	};
	
function hello(){
	$.ajax({
		url:"hello-world?name=Toto",
		method:"GET",
		success:function(data) {
			$("#hello").html(data.content);
		}
	});
};