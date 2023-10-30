### Создайте новый проект и репозиторий, назовите их HW11.
Создайте файл readme.md в корневой папке проекта и коротко опишите, что из себя представляет данный проект. Этот файл нужно закоммитить и запушить в гит. После этого создайте новую ветку, где вы и будете выполнять домашнее задание, то есть весь код, который связан с выполнением задания, должен быть в ветке, никаких больше пушов в master/main. После выполнения домашнего задания, сделайте Pull request и ждите, пока его не одобрят, только после этого мердж в основную ветку (master/main). Не надо коммитить и пушить папку .idea, файлы и файл с расширением .iml. В гит только содержимое директории src и readme.md.

Скопируйте методы, решите задачу и напишите тесты для каждого метода.

###Задание 1

Возвращает наибольший элемент, у которого есть хотя бы один дубликат.
Если ни один элемент не имеет дубликатов (элемента с тем же значением), возвращает null.
maxDuplicate([1, 2, 3]) => null
maxDuplicate([1, 2, 2]) => 2
maxDuplicate([1, 2, 2, 1, 1]) => 2
@param nums Список целых чисел
@return Максимальный элемент с дубликатом. Null, если дубликат не найден. */ public Integer maxDuplicate(List nums) { // Ваша реализация будет здесь }
###Задание 2

Для заданного списка строк добавляет нумерацию к каждой строке.
Входной список состоит из строк. Для каждого элемента во входном списке
в выходном списке добавляется нумерация после строки. Формат следующий: #N, где N начинается с 1.
Сравнение строк должно быть регистронезависимым.
Регистр символов в самой строке в выходном списке должен остаться таким же, как во входном списке.
Выходной список имеет такое же количество элементов, как и входной список.
Для каждого элемента в выходном списке добавляется "#N", где N = 1, 2, 3 и так далее.
wordNumeration(["hi", "hi", "welcome"]) => ["hi#1", "hi#2", "welcome#1"]
wordNumeration(["Hi", "hi", "welcome", "no", "hI", "HI"]) => ["Hi#1", "hi#2", "welcome#1", "no#1", "hI#3", "HI#4"]
@param words Список строк.
@return Список строк с нумерацией. */ public List wordNumeration(List words) { // Ваша реализация будет здесь }
### Задание 3

Можем ли построить ряд из кирпичей?
Мы хотим построить ряд из кирпичей длиной goal дюймов.
У нас есть некоторое количество маленьких кирпичей (по 1 дюйму каждый) и больших кирпичей (по 5 дюймов каждый).
Вернуть True, если возможно построить заданную длину, выбирая из имеющихся кирпичей.
Это немного сложнее, чем кажется, и может быть сделано без использования циклов.
makeBricks(3, 1, 8) → True
makeBricks(3, 1, 9) → False
makeBricks(3, 2, 10) → True
@param small Количество маленьких кирпичей.
@param big Количество больших кирпичей.
@param goal Длина ряда, который мы хотим построить.
@return Можем ли построить ряд? */ public boolean makeBricks(int small, int big, int goal) { // Ваша реализация будет здесь }