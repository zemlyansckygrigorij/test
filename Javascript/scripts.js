'use strict' ;




let head = document.getElementById('head');
let sum = 0;

count(head);

document.write(sum);

function count(element){
	if(element.value) sum = sum +element.value;
	for(let i =0; i<element.childNodes.length;i++){
		count(element.childNodes[i]);
	}
}
