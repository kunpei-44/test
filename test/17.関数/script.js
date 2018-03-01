function totalPrice(price, tax=1.08, haiso=400){
    return(price+haiso)*tax;
}

document.write(totalPrice(300)+"<br>");
document.write(totalPrice(450)+"<br>");

function nameHello(name){
    return name +"さん。こんにちは";
}

document.write(nameHello("高橋"));
document.write("<br>");
document.write(nameHello("鈴木"));
document.write("<br>");

function juusyo(abc){
    return abc + "出身の方";
}

document.write(juusyo("東京"));
document.write("<br>");
document.write(juusyo("神奈川"));
document.write("<br>");
document.write(juusyo("大阪"));
document.write("<br>");

function test(num){
    return "あなたの点数は"+num+"点です。";
}

document.write(test(90));
document.write("<br>");

document.write(test(88));
document.write("<br>");

document.write(test(79));
document.write("<br>");

function oshirase(num){
    return "会員Noは"　+num+"です。";
}

document.write(oshirase(1022));
document.write("<br>");

document.write(oshirase(1199));
document.write("<br>");

document.write(oshirase(2047));
document.write("<br>");