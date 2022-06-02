// 这是一个数据处理函数，它传入日期，处理并获取当天的数据
//这是一个纯函数，所以只要传入相同的参数，多次调用返回的结果一定是一样的。
function process(date){
var result = date;
// 省略掉中间复杂的处理过程。
result += "数据的处理结果！"
return result;
}
//一个高阶函数，参数为函数，返回值也是函数
function widthProcess(base){
var cache = {}; //缓存的数据对象
return function() { //内部函数，闭包，
//arguments对象是所有非箭头函数中都可用的局部变量,此对象包含传递给函数的每个参数。
//虽然此内部函数名义定义形参，但后面调用它时会传入日期做参数，arguments也能得到
var date = arguments[0];
if(cache[date]){ //如果这个日期缓存的数据不为空，
console.log("数据存在，直接返回数据！");
return cache[date]; //则返回这个以日期为参数的数据函数
}else{ //如果缓存为空，则调用数据处理函数base
console.log("数据不存在，重新计算!");
cache[date] = base(date); //技术这个时期的数据处理结果，并保存到缓存中
return base(date);
}
}
}
//调用高阶函数，返回一个函数_process
var _process = widthProcess(process);
// 经过上面的代码的处理，就可以使用 _process来获取我们想要的数据
// 如果数据存在，就返回缓存中数据，如果不存在，则调用process方法重新获取
console.log(_process("2017-06-03")); //调用_process函数,传入参数为日期。这是第一次调用
console.log(_process("2017-06-03")); //再次调用，发现是直接返回缓冲的数据，不用再次计算了