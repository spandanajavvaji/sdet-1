fruit_shop = {
    "banana": 10,
    "grapes": 20,
    "orange": 30,
    "mango":40
}

fruit= input("what are you looking for? ").lower()

if(fruit in fruit_shop):
    print("Yes, this is available")
else:
    print("No, this is not available")