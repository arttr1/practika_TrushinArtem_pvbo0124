1️⃣ UML-диаграмма (текстовое описание)

Интерфейс: Movable

Методы:

- void moveUp()
- void moveDown()
- void moveLeft()
- void moveRight()

Класс: MovablePoint (точка)
Поля:

- int x
- int y
- int xSpeed
- int ySpeed

Реализует: Movable

Методы:

- Конструктор с параметрами (x, y, xSpeed, ySpeed)
- Методы moveUp(), moveDown(), moveLeft(), moveRight()
- String toString() для перевода координат в строку

Класс: MovableRectangle (движущийся прямоугольник)

Поля:

- MovablePoint topLeft
- MovablePoint bottomRight

Реализует: Movable

Методы:

- Конструктор с параметрами (topLeft, bottomRight)
- Методы moveUp(), moveDown(), moveLeft(), moveRight() (движение обеих точек)
- boolean speedTest() — проверяет, что скорости точек одинаковы
- String toString() — выводит координаты прямоугольника
