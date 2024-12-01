from Building import Building


class OfficeBuilding(Building):
    """
    Клас OfficeBuilding розширює базовий клас Building.
    """

    def __init__(self, address, floors, area, total_offices):
        super().__init__(address, floors, area)
        self.total_offices = total_offices
        self.occupied_offices = 0

    def add_tenants(self, count):
        """
        Додає орендарів до офісів.
        """
        if self.occupied_offices + count > self.total_offices:
            print(f"Немає місця для {count} орендарів.")
        else:
            self.occupied_offices += count
            print(f"Додано {count} орендарів.")

    def remove_tenants(self, count):
        """
        Звільняє офіси.
        """
        if count > self.occupied_offices:
            print("Недостатньо орендарів для звільнення.")
        else:
            self.occupied_offices -= count
            print(f"Звільнено {count} офісів.")

    def get_free_offices(self):
        """
        Повертає кількість вільних офісів.
        """
        return self.total_offices - self.occupied_offices

    def reset_tenants(self):
        """
        Скидає орендарів до 0.
        """
        self.occupied_offices = 0
        print("Всі офіси звільнено.")

    def is_overloaded(self):
        """
        Перевіряє, чи переповнена будівля.
        """
        return self.occupied_offices > self.total_offices

    def add_offices(self, count):
        """
        Додає нові офіси.
        """
        self.total_offices += count
        print(f"Додано {count} офісів.")

    def renovate_offices(self, count):
        """
        Ремонтує зазначену кількість офісів.
        """
        print(f"Відремонтовано {count} офісів.")

    def calculate_occupancy_rate(self):
        """
        Обчислює відсоток заповнення офісів.
        """
        return (self.occupied_offices / self.total_offices) * 100 if self.total_offices else 0

    def get_status(self):
        """
        Отримує детальний статус офісної будівлі.
        """
        base_status = super().get_status()
        return f"{base_status}, офісів: {self.occupied_offices}/{self.total_offices}, зайнятість: {self.calculate_occupancy_rate():.2f}%"