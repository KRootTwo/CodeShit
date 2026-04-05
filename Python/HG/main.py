import cv2
import mediapipe as mp
import numpy as np

# print("OpenCV:", cv2.__version__)
# print("MediaPipe:", mp.__version__)
# print("NumPy:", np.__version__)

mp_hands = mp.solutions.hands
mp_draw = mp.solutions.drawing_utils

cap = cv2.VideoCapture(1)
cap.set(3, 1280)
cap.set(4, 720)

def main() :
    while True :
        attempt = 0
        success, img = cap.read()
        while not success and attempt < 5 :
            time.sleep(0.2) 
            success, img = cap.read()
            attempt += 1
        if not success :
            print ("Failed to read frame nigger")
            break
