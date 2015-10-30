$(document).ready(
	function(){
		console.log("ready!");
		$("#diabloButton").click(diablo);
		$("#hearthstoneButton").click(hearthstone);
		$("#starcraftButton").click(starcraft);
		$("#wowButton").click(wow);
		$("#herosOfTheStormButton").click(herosOfTheStorm);
		$("#logo").click(blizzard);
	}
);

function blizzard(){
	$("style").remove();
	$.ajax({
		url:"css/styleBlizzard.css",
		success:function(data) {
			$("head").append("<style>" + data + "</style>");
		}
	});			
};

function diablo(){
	console.log("MDR DIABLO");
	$("style").remove();
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
		url:"diablo.html",
		method:"GET",
		success:function(data) {
			$("#corpsSite").html(data);
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
		url:"hearthstone.html",
		method:"GET",
		success:function(data) {
			$("#corpsSite").html(data);
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
		url:"starcraft.html",
		method:"GET",
		success:function(data) {
			$("#corpsSite").html(data);
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
		url:"wow.html",
		method:"GET",
		success:function(data) {
			$("#corpsSite").html(data);
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