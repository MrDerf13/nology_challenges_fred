2 == "2"; //true
2 === 2; //true
2 === "2"; //false
"2" + 3 == 23; //true
"2" + 3 === 5; // false
10 % 3; // 1
10 % 3 === 1; // true
(100 % 7) % 5; // 2
(100 % 7) % 5 !== 0; // true
(100 % 7) % 9 == 2; // true
!(10 % 2); // 1
!!!!((10 % 7) % 3); // 0
10 % 3 === -1 % 2; // false
(892783 != "89278" + 3) == 0; //true
true && false; // false  
false || true; // true
true || false; //true
true || false; //true
true || false + true; //true
true * false && false + true; //0
10 && 123 && -1 && 3; //3
10 && 123 && 0 && 3; //0
(10 && (123 || "") && parseInt("Roisin")) || 23 / 23 - 1; // 0
3 && "Calum" && ("" || 26); //26
3 && "Remi" && (null || 86 * 0 || ("" + 1 && "Cat" + "Dog")); //CatDog