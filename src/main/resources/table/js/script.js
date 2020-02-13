// JavaScript source code
do {
    var column = prompt("Введите количество колонок", 5);
    //console.log(isNaN(column));
} while (!isFinite(column));
do {
    var row = prompt("Введите количество строк", 5);
} while (!isFinite(row));

document.write(
    "<table>");
for (var i = 1; i <= row; i++)
{
    document.write("<tr>");
    for (var j = 1; j <= column; j++) {
        document.write("<td>" +i*j+ "</td>");
    }
    document.write("</tr>");
}
document.write("</table>");
