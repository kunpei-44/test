var myoji=["田中","高橋","斎藤"];
myoji.unshift("鈴木");
document.write(myoji);

var abc=["高知","愛媛","香川"];
abc.unshift("徳島");
document.write(abc);

var xyz1=["名前","住所","電話番号"];
xyz1.push("アドレス");
document.write(xyz1);

var rech=["good","bad","nice"];
rech.push("lucky");
document.write(rech);

var xyz2=["名前","住所","電話番号"];
xyz2.pop();
document.write(xyz2);

var myoji=["田中","高橋","斎藤"];
document.write(myoji.slice(0,2));

var age=[18,26,33,41,50];
document.write(age.slice(1,4));