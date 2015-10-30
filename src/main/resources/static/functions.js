$(document).ready(
	function(){
		console.log("ready!");
		$("#diabloButton").click(diablo);
		$("#hearthstoneButton").click(hearthstone);
		$("#starcraftButton").click(starcraft);
		$("#wowButton").click(wow);
		$("#herosOfTheStormButton").click(herosOfTheStorm);
		$("#logo").click(blizzard);
		$.ajax({
			url:"article",
			method:"GET",
			success:function(data) {
				$.each(data, function (index) {
		            //alert(data[index].content);
		            $("#articles").append(data[index].title + data[index].date + data[index].content + data[index].writter);
	            });
			}
		});
		$.ajax({
			url:"last-article",
			method:"GET",
			success:function(data) {
				$.each(data, function (index) {
		            //alert(data[index].content);
		            $("#dernier_article").append(data[index].title + data[index].date + data[index].content + data[index].writter);
	            });
			}
		});
	}
);

function blizzard(){
	$("style").remove();
	$("#articles").empty();
	$.ajax({
		url:"css/styleBlizzard.css",
		success:function(data) {
			$("head").append("<style>" + data + "</style>");
		}
	});	
	$.ajax({
		url:"article",
		method:"GET",
		success:function(data) {
			$.each(data, function (index) {
	            //alert(data[index].content);
	            $("#articles").append(data[index].title + data[index].date + data[index].content + data[index].writter);
            });
		}
	});		
};

function diablo(){
	console.log("MDR DIABLO");
	$("style").remove();
	$("#articles").empty();
	$.ajax({
		url:"title?name=Diablo",
		method:"GET",
		success:function(data) {
			$("#titlePage").html(data.content);
		}
	});
	$.ajax({
		url:"hello-world?name=DiabloFan",
		method:"GET",
		success:function(data) {
			$("#helloMessage").html(data.content);
		}
	});
	$.ajax({
		url:"article?game=0",
		method:"GET",
		success:function(data) {
			$.each(data, function (index) {
	            //alert(data[index].content);
	            $("#articles").append(data[index].title + data[index].date + data[index].content + data[index].writter);
            });
		}
	});
	$.ajax({
		url:"css/styleDiablo.css",
		success:function(data) {
			$("head").append("<style>" + data + "</style>");
		}
	});			
};
	
function hearthstone(){
	console.log("MDR HEARTHSTONE");
	$("style").remove();
	$("#articles").empty();
	$.ajax({
		url:"title?name=Hearthstone",
		method:"GET",
		success:function(data) {
			$("#titlePage").html(data.content);
		}
	});
	$.ajax({
		url:"hello-world?name=HSFan",
		method:"GET",
		success:function(data) {
			$("#helloMessage").html(data.content);
		}
	});
	$.ajax({
		url:"article?game=3",
		method:"GET",
		success:function(data) {
			$.each(data, function (index) {
	            //alert(data[index].content);
	            $("#articles").append(data[index].title + data[index].date + data[index].content + data[index].writter);
            });
		}
	});
	$.ajax({
		url:"css/styleHS.css",
		success:function(data) {
			$("head").append("<style>" + data + "</style>");
		}
	});
	
};

function starcraft(){
	console.log("MDR STARCRAFT");
	$("style").remove();
	$("#articles").empty();
	$.ajax({
		url:"title?name=Starcraft",
		method:"GET",
		success:function(data) {
			$("#titlePage").html(data.content);
		}
	});
	$.ajax({
		url:"hello-world?name=SCFan",
		method:"GET",
		success:function(data) {
			$("#helloMessage").html(data.content);
		}
	});
	$.ajax({
		url:"article?game=4",
		method:"GET",
		success:function(data) {
			$.each(data, function (index) {
	            //alert(data[index].content);
	            $("#articles").append(data[index].title + data[index].date + data[index].content + data[index].writter);
            });
		}
	});
	$.ajax({
		url:"css/styleSC.css",
		success:function(data) {
			$("head").append("<style>" + data + "</style>");
		}
	});
			
};

function wow(){
	console.log("MDR WOW");
	$("style").remove();
	$("#articles").empty();
	$.ajax({
		url:"title?name=World Of Warcraft",
		method:"GET",
		success:function(data) {
			$("#titlePage").html(data.content);
		}
	});
	$.ajax({
		url:"hello-world?name=WowFan",
		method:"GET",
		success:function(data) {
			$("#helloMessage").html(data.content);
		}
	});
	$.ajax({
		url:"article?game=1",
		method:"GET",
		success:function(data) {
			$.each(data, function (index) {
	            //alert(data[index].content);
	            $("#articles").append(data[index].title + data[index].date + data[index].content + data[index].writter);
            });
		}
	});	
	$.ajax({
		url:"css/styleWow.css",
		success:function(data) {
			$("head").append("<style>" + data + "</style>");
		}
	});
};

function herosOfTheStorm(){
	console.log("MDR Heros Of The Storm");
	$("style").remove();
	$("#articles").empty();
	$.ajax({
		url:"title?name=Heros Of The Storm",
		method:"GET",
		success:function(data) {
			$("#titlePage").html(data.content);
		}
	});
	$.ajax({
		url:"hello-world?name=HerosFan",
		method:"GET",
		success:function(data) {
			$("#helloMessage").html(data.content);
		}
	});
	$.ajax({
		url:"hots.html",
		method:"GET",
		success:function(data) {
			$("#corpsSite").html(data);
		}
	});
	$.ajax({
		url:"css/styleHotS.css",
		success:function(data) {
			$("head").append("<style>" + data + "</style>");
		}
	});		
};