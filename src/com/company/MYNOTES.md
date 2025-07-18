# 	MY NOTES 

## Oopsss

- solving problem by creating objects.
- real world problem solving.
- class-blueprint, object - instantiation of class.
- memory allocated in computer for that particular class after object created.

Absolutely! Here’s your cute + clear Markdown note version to copy-paste 👇

## ✅ Java: `int` vs `void` Methods

### 👉 Use `int` when you want to **get and use the result**:
```java
public int area(int n) {
    return n * n;
}
int a = obj.area(5); // Store or use it

```
### 👉 Use void when you just want to print:
```java
public void area(int n) {
System.out.println(n * n);
}
obj.area(5); // Just prints, doesn't return
```

## 📐 Geometry Formulas: Area and Volume

---

### 🔵 Circle
- **Area**: `π × r²`
- **Circumference**: `2 × π × r`  
  where `r` = radius

---

### 🟠 Cylinder
- **Curved Surface Area (CSA)**: `2 × π × r × h`
- **Total Surface Area (TSA)**: `2 × π × r × (r + h)`
- **Volume**: `π × r² × h`  
  where `r` = radius, `h` = height

---

### 🟦 Rectangle
- **Area**: `l × b`
- **Perimeter**: `2 × (l + b)`  
  where `l` = length, `b` = breadth

---

### 🟫 Cuboid
- **Lateral Surface Area (LSA)**: `2 × h × (l + b)`
- **Total Surface Area (TSA)**: `2 × (lb + bh + hl)`
- **Volume**: `l × b × h`  
  where `l` = length, `b` = breadth, `h` = height


    this.brand does NOT become meaningful until an object is created. 
    We call it an object variable because it’s a variable that belongs
    to the object once the object is created.

## 🔹 Java `this` Keyword – Short Note

- `this` refers to the **current object** calling the method.
- Used to access **instance variables** of that object.
- Useful when method parameters have the same name as instance variables.

### ✅ Example:
```java
class Student {
    String name;
    void setName(String name) {
        this.name = name;
    }
}
```

- `this.name` → instance variable
- `name` → method parameter

**Note:** Object must be created using `new` before `this` has any meaning.

# ⚔️ Abstract Class vs Interface in Java — Key Differences

| Feature                | Abstract Class                          | Interface                              |
|------------------------|------------------------------------------|-----------------------------------------|
| 🔗 Relationship Type   | "Is-a" (Base blueprint)                 | "Can-do" (Ability/Feature)             |
| 🧱 Method Types        | Abstract + Concrete                     | Only abstract (till Java 7)            |
| 🧪 Default Methods     | ✅ Yes (concrete methods allowed)       | ❌ Not before Java 8, `default` since 8 |
| 🧰 Variables           | Instance variables allowed              | Only `public static final` (constants) |
| 🛠️ Constructor         | ✅ Yes                                   | ❌ No                                   |
| 🔄 Inheritance Limit   | Can extend only **one** abstract class  | Can implement **multiple** interfaces  |
| 👑 Access Modifiers    | Can use `private`, `protected`, etc.    | Only `public` methods                  |
| 📦 Use Case            | Common logic / structure                | Capability / contract enforcement       |

    note: Java me class ek hi class extend kar sakti hai, lekin multiple interfaces implement kar sakti hai.

# 🔑 Java OOP – Super Quick Notes (p11)

    - Child can use parent methods
    - Parent ref = child obj → only parent methods
    - Child ref = parent obj ❌ not allowed
    - Method call → object decides (runtime)
    - Method access → ref type decides (compile-time)
    - If child overrides → child method runs
    - No fallback to parent if overridden
    - Interface = implements
    - Class = extends
    - Interface can extend interface
    - Interface can't implement interface
    - Interface ref = child object → valid

| Modifier   | Subclass (Other package)? |
|------------|---------------------------|
| `default`  | ❌ Not allowed             |
| `protected`| ✅ Allowed                 |
