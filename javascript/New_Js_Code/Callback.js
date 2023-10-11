function myFun(number1,number2,callback){

    document.write("sum = "+(number1+number2));
    callback();
}

function callbackDisplay(){

    document.write("<br>Hello");
}

// ----------- After specific time the function called with the help of setTimeout() ----------------

function myFun1(number1,number2,callback){

    document.write("sum = "+(number1+number2));
   setTimeout (callback,5000);
}

function callbackDisplay1(){

    document.write("<br>Hello");
}

