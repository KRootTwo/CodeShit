from PIL import Image

image = Image.open("input.jpg")

rotated = image.rotate(-45)
rotated.save("rotated.jpg")
rotated.show()

print("Image rotate successfully")