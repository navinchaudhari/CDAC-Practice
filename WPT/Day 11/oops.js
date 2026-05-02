class Student {
  constructor() {
    console.log("Const Called");
    this.id = 101;
    this.name = "Ramesh";
    this.marks = 78;
  }
}

const s1 = new Student();
console.log(s1.id);
console.log(s1.name);
console.log(s1.marks);
