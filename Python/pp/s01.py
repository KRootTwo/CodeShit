from PIL import Image

image = Image.open("input.jpg")

# Horizontal Flip
horizontal_flip = image.transpose(Image.FLIP_LEFT_RIGHT)
horizontal_flip.save("horizontal_flip.jpg")
horizontal_flip.show()

# Vertical Flip
vertical_flip = image.transpose(Image.FLIP_TOP_BOTTOM)
vertical_flip.save("vertical_flip.jpg")
vertical_flip.show()

print("Image flipped horizontally and vertically successfully")