for(var i = 1; i<=10; i++){
    if(i%2==0){
        document.write(i);
    }
}


for(var a =3; a<=8; a++){
    if(a>5){
        document.write("<br>"+a);
        document.write("<br>");
    }
}

for(var b=1; b<=9;b++){
    for(var c=1; c<=9; c++){
        document.write(b*c);
    }
    document.write("→"+b+"の段<br>");
}

for(var star1=1; star1<=5; star1++){
    for(var star2=1; star2<=5; star2++){
        document.write("★");
    }
    document.write("<br>");
}

for(var month=1; month<=12; month++){
    document.write(month+"月:");
    for(var day=1; day<=30; day++){
        document.write(day+"日/");
    }
    document.write("<br><br>");
}

for(var num=10; num>=0; num--){
    if(num==0){
        document.write("終了！"+"<br>");
    }else{
        document.write(num + "<br>");
    }
}

for(var no1=0; no1<5; no1++){
    for(var no2=0; no2<=5; no2++){
        if(no2 % 2==0){
            document.write("★");
        }else{
            document.write("☆");
        }
        document.write("<br>");
    }
}

for(var xyz=1; xyz<30; xyz++){
    if(xyz %2==0){
        document.write("2の倍数");
    }else if(xyz%3==0){
        document.write("3の倍数");
    }else{
        document.write(xyz);
    }document.write("<br>");
}