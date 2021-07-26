/**
 * 
 */
let x = "100";
let y = "10";
let z = x * y;   
document.getElementById("demo20").innerHTML = z;

let a = NaN;
let b= 10;
document.getElementById("demo1").innerHTML = a + b;


let k=5;
let l=new Number(123);
document.getElementById("demo2").innerHTML =typeof k + "<br>"+typeof l;


const d = new Date();
d.setFullYear(2020);
document.getElementById("demo3").innerHTML = d;


const array=["saab","volvo","benz"];
document.getElementById("demo4").innerHTML =array;

const array1 = ["Cecilie", "Lone"];
const array2 = ["Emil", "Tobias", "Linus"];
const array3 = ["Robin", "Morgan"];
const array4=array1.concat(array2,array3);
document.getElementById("demo5").innerHTML =array4;



const fruits = ["Banana", "Orange", "Apple", "Mango"];
document.getElementById("demo6").innerHTML = fruits;
fruits.shift();
document.getElementById("demo7").innerHTML = fruits;



const numbers=[10,15,85,748,1,20,500]
document.getElementById("demo8").innerHTML =smallestNumber(numbers);
function smallestNumber(arr){
	return Math.min.apply(null,arr);
}


const numbers1 = [45, 4, 9, 16, 25];
let txt = "";
numbers1.forEach(myFunction);
document.getElementById("demo9").innerHTML = txt;

function myFunction(value, index, array) {
  txt += value + "<br>"; 
}


const numbers2 = [45, 4, 9, 16, 25];
let allOver18 = numbers.every(myFunction);
document.getElementById("demo10").innerHTML = "All over 18 is " + allOver18;
function myFunction1(value, index, array) {
  return value > 18;
}


document.getElementById("demo11").innerHTML = 
  "john".constructor + "<br>" +
  (3.14).constructor + "<br>" +
  false.constructor + "<br>" +
  [1,2,3,4].constructor + "<br>" +
  {name:'john', age:34}.constructor + "<br>" +
  new Date().constructor + "<br>" +
  function () {}.constructor;


let mn = "";
document.getElementById("demo12").innerHTML = Boolean(mn);


const time = new Date().getHours();
document.getElementById("demo13").innerHTML = "the current hour is "+time;
let greeting;
if (time < 10) {
  greeting = "Good morning";
} else if (time < 20) {
  greeting = "Good day";
} else {
  greeting = "Good evening";
}
document.getElementById("demo14").innerHTML = greeting;



const persons = {fname:"John", lname:"Doe", age:25}; 
let text = "";
for (let s in persons) {
  text += persons[s] + " ";
}
document.getElementById("demo15").innerHTML = text;


var teext = "";
function message() {
  try {
    addalert("Welcome guest!");
  }
  catch(err) {
    teext = "There was an error on this page.\n\n";
    teext += "Click OK to continue viewing this page,\n";
    teext += "or Cancel to return to the home page.\n\n";
    if(!confirm(teext)) {
      document.location.href = "https://www.w3schools.com/";
    }
  }
}




function getElements() {
  var u = document.getElementsByName("x");
  document.getElementById("demo16").innerHTML = u.length;
}


document.getElementById("demo17").innerHTML ="Number of forms: " + document.forms.length();























