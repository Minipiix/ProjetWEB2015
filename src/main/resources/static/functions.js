$(document).ready(
	function(){
		console.log("ready!");
		$("#diabloButton").click(diablo);
		$("#hearthstoneButton").click(hearthstone);
		$("#starcraftButton").click(starcraft);
		$("#wowButton").click(wow);
		$("#herosOfTheStormButton").click(herosOfTheStorm);
	}
);

function diablo(){
	console.log("MDR DIABLO");
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
};
	
function hearthstone(){
	console.log("MDR HEARTHSTONE");
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
};

function starcraft(){
	console.log("MDR STARCRAFT");
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
			
};

function wow(){
	console.log("MDR WOW");
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
};

function herosOfTheStorm(){
	console.log("MDR Heros Of The Storm");
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
};