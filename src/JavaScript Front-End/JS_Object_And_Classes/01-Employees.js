function employees(input) {
    let employees = {};
    for (const employee of input) {
        employees[employee] = employee.length;
    }
    for (const employeeName in employees) {
        console.log(`Name: ${employeeName} -- Personal Number: ${employees[employeeName]}`);
    }
}

employees([
    'Silas Butler',
    'Adnaan Buckley',
    'Juan Peterson',
    'Brendan Villarreal'
    ])