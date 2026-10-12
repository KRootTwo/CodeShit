from PIL import Image

image = Image.open("input.jpg")
print("Total number of pixel of original image", image.size)

resized_images = image.resize((200, 200))
resized_images.save("resized_image.jpg")
resized_images.show()

print("Image resized successfully")