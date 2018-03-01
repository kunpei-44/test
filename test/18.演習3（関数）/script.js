function menseki(hankei){
    return hankei*hankei*3.14;
}

document.write("半径5cmの円の面積は"+menseki(5));
document.write("<br>");

document.write("半径7cmの円の面積は"+menseki(7));
document.write("<br>");

document.write("半径10cmの円の面積は"+menseki(10));
document.write("<br>");

document.write("<br>");

function amusement(otona, kodomo){
    return otona*500 + kodomo*200;
}

document.write("Aグループの合計金額は"+amusement(2,4));
document.write("<br>");

document.write("Bグループの合計金額は"+amusement(1,5));
document.write("<br>");

document.write("Cグループの合計金額は"+amusement(3,7));
document.write("<br>");