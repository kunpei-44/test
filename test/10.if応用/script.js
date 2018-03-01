var a1 = 5;

if(a1 > 0){
    if(a1 < 10){
        document.write("A");
    }
}

var a2= 10;

if(a2 >= 5){
    if(a2 <= 20){
        document.write("B");
    }
}

var a3 = 12;

if(a3 > 0){
    if(a3 <10){
        document.write("A");
    }else if(a3 > 10){
        document.write("B");
    }
}

var a4 = 5;

if(a4 < 3){
    document.write("A");
}else if(a4 < 5){
    document.write("B");
}else{
    document.write("C");
}

var a5 = 6;

if(a5 > 10){
    document.write("A");
}else if(a5 < 5 || a5==6){
    document.write("B");
}else{
    document.write("C");
}

var age =18;
var seibetsu="女性";

if(age>=18){
    if(seibetsu=="女性"){
        document.write("Aさん");
    }else if(seibetsu=="男性"){
        document.write("Bさん");
    }else{
        document.write("Cさん");
    }