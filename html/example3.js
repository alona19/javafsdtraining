/**
 * 
 */

var x=5;

var y= ++x;
var z= x++;
 x+=5;
document.getElementById("demo1").innerHTML="x "+x;
document.getElementById("demo2").innerHTML="y "+y;
document.getElementById("demo3").innerHTML="z "+z;


const cars = ["Saab","Volvo","BMW"];

document.getElementById("demo4").innerHTML = cars[0];


let car;
document.getElementById("demo5").innerHTML = car+"<br>"+typeof car;


const persons={
	firstname:"john",
	lastname:"doe",
	age:10
}


document.getElementById("demo6").innerHTML=persons.firstname+" is "+persons.age+" years old"


function myTextFn(txt){
	document.getElementById("demo7").innerHTML=txt;
}













