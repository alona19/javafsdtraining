/**
 * 
 */

function toCelsius(f) {
  return (5/9) * (f-32);
}
document.getElementById("demo").innerHTML = toCelsius;


function displayDate(){
	
	document.getElementById("demo1").innerHTML = Date();
	
}

let str="we can locate where it 'locate'";
document.getElementById("demo2").innerHTML=str.indexOf("locate");


function replaceFn(){
	
	let text = document.getElementById("demo3").innerHTML;
  	document.getElementById("demo3").innerHTML = text.replace("Microsoft","W3Schools");

	
}





