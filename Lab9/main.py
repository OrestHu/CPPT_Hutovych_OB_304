from OfficeBuilding import OfficeBuilding

if __name__ == "__main__":
    # Створюємо офісний центр
    office = OfficeBuilding("вул. Ділова, 12", 10, 5000, 40)

    # Початковий статус
    print("\n1. Початковий стан будівлі:")
    print(office.get_status())

    # Додаємо орендарів
    print("\n2. Додаємо орендарів:")
    office.add_tenants(30)
    print(office.get_status())

    # Звільняємо офіси
    print("\n3. Звільняємо 5 офісів:")
    office.remove_tenants(5)
    print(office.get_status())

    # Спроба додати більше орендарів, ніж є офісів
    print("\n4. Спроба додати занадто багато орендарів:")
    office.add_tenants(20)

    # Показуємо кількість вільних офісів
    print("\n5. Кількість вільних офісів:")
    print(f"Вільні офіси: {office.get_free_offices()}")

    # Ремонт будівлі
    print("\n6. Ремонт будівлі:")
    office.renovate_building(500)
    print(office.get_status())

    # Оновлення кількості поверхів
    print("\n7. Додаємо нові поверхи:")
    office.add_floors(2)
    print(office.get_status())

    # Збільшення площі офісів
    print("\n8. Додаємо площу:")
    office.add_area(1000)
    print(office.get_status())

    # Скидання орендарів
    print("\n9. Виселяємо всіх орендарів:")
    office.reset_tenants()
    print(office.get_status())

    # Перевірка чи будівля переповнена
    print("\n10. Чи переповнена будівля?")
    print(f"Переповнена: {office.is_overloaded()}")