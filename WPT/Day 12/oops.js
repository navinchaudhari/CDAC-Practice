class Student {
  constructor(id, name, marks) {
    this.id = id;
    this.name = name;
    this.marks = marks;
  }

  displayData() {
    console.log(this.id, this.name, this.marks);
  }
}

const s1 = new Student(23, "Navin", 67.98);
s1.displayData();

const s2 = new Student(32, "Bhavesh", 98.6);
s2.displayData();
