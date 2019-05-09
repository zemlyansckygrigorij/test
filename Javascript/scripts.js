'use strict' ;
//Определение зацикленности однонаправленного списка
// 1. создаем обьекты
var o1 ={
	name: "o1",
	next: null
}

var  o2 ={
	name: "o2",
	next: null
}
var  o3 ={
	name: "o3",
	next: null
}
var  o4 ={
	name: "o4",
	next: null
}
var  o5 ={
	name: "o5",
	next: null
}
var  o6 ={
	name: "o6",
	next: null
}
var  o7 ={
	name: "o7",
	next: null
}
var  o8 ={
	name: "o8",
	next: null
}
var  o9 ={
	name: "o9",
	next: null
}
var  o10 ={
	name: "o10",
	next: null
}
var o11 ={	
name: "o11",
	next: null
}

// 2. создаем массив обьектов
var  arr = [];
arr.push(o1);
arr.push(o2);
arr.push(o3);
arr.push(o4);
arr.push(o5);
arr.push(o6);
arr.push(o7);
arr.push(o8);
arr.push(o9);
arr.push(o10);
arr.push(o11);

//3. задаем  у элементов с первого до предпоследнего ссылки на другие обьекты
//выведено в отдельную операцию потомучто нельзя создавать ссылки на несуществующие обьекты
for( let i=0; i <arr.length-1; i++){
	arr[i].next = arr[i+1];
}



//4. задаем у последнего элемента ссылки
o11.next = o1;// ссылка на первый элемент
//o11.next = null;

//5. вывод  результата
console.log(check(arr));

function check(array){
	let first = array[0];
	let current = first;
	while(current.next != first||current.next != null){
		
		current = current.next;
		if(current== first){
			return true;
		}
		if(current== null){
			return false;
		}
		
	}
}

