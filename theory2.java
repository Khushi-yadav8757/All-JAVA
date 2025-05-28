//for loop
for (int i = 1; i <= 5; i++) {
    System.out.println("i = " + i);
}

//while loop
int i = 1;
while (i <= 5) {
    System.out.println("i = " + i);
    i++;
}

//do-while loop
int i = 1;
do {
    System.out.println("i = " + i);
    i++;
} while (i <= 5);

//break 

for (int i = 1; i <= 5; i++) {
    if (i == 3) break;
    System.out.println(i);
}
// Output: 1 2
// continue
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue;
    System.out.println(i);
}
// Output: 1 2 4 5

