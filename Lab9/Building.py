class Building:
    """
    Клас Building представляє будівлю з базовими характеристиками.
    """

    def __init__(self, address, floors, area):
        """
        Ініціалізує об'єкт будівлі.

        :param address: Адреса будівлі.
        :param floors: Кількість поверхів.
        :param area: Загальна площа будівлі в квадратних метрах.
        """
        self.address = address
        self.floors = floors
        self.area = area

    def get_status(self):
        """
        Отримує інформацію про будівлю.
        """
        return f"Будівля за адресою {self.address}, поверхів: {self.floors}, площа: {self.area} м²"

    def add_floors(self, count):
        """
        Додає нові поверхи до будівлі.
        """
        self.floors += count
        print(f"Додано {count} поверхів.")

    def add_area(self, additional_area):
        """
        Збільшує загальну площу будівлі.
        """
        self.area += additional_area
        print(f"Додано {additional_area} м² площі.")

    def renovate_building(self, renovation_cost):
        """
        Проводить ремонт будівлі.
        """
        print(f"Будівля за адресою {self.address} відремонтована за {renovation_cost} грн.")

    def is_high_rise(self):
        """
        Перевіряє, чи є будівля висотним будинком (10+ поверхів).
        """
        return self.floors >= 10

    def calculate_density(self):
        """
        Обчислює щільність забудови (м² на поверх).
        """
        return self.area / self.floors if self.floors else 0

    def relocate(self, new_address):
        """
        Змінює адресу будівлі.
        """
        self.address = new_address
        print(f"Будівлю переміщено на нову адресу: {new_address}.")

    def demolish(self):
        """
        Знищує будівлю.
        """
        print(f"Будівля за адресою {self.address} зруйнована.")

    def is_area_sufficient(self, minimum_area):
        """
        Перевіряє, чи площа будівлі відповідає мінімальним вимогам.
        """
        return self.area >= minimum_area