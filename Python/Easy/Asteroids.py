from math import floor

w, h, t1, t2, t3 = [int(i) for i in input().split()]
picture_1, picture_2 = [], []
picture_3 = [list("." * w) for _ in range(h)]

for i in range(h):
    first_picture_row, second_picture_row = input().split()
    picture_1.append(list(first_picture_row))
    picture_2.append(list(second_picture_row))

asteroids_list = set(picture_1[i][j] for i in range(h) for j in range(w))
asteroids_list.discard(".")
asteroids = {k: {} for k in asteroids_list}

for i in range(h):
    for j in range(w):
        if picture_1[i][j] in asteroids:
            asteroids[picture_1[i][j]]["t1"] = (j, i)
        if picture_2[i][j] in asteroids:
            asteroids[picture_2[i][j]]["t2"] = (j, i)

for name, positions in sorted(asteroids.items(), key=lambda x: x[0], reverse=True):
    new_x = floor(
        (positions["t2"][0] - positions["t1"][0]) / (t2 - t1) * (t3 - t1)
        + positions["t1"][0]
    )
    new_y = floor(
        (positions["t2"][1] - positions["t1"][1]) / (t2 - t1) * (t3 - t1)
        + positions["t1"][1]
    )
    if (0 <= new_x < w) and (0 <= new_y < h):
        picture_3[new_y][new_x] = name

for i in range(h):
    print("".join(picture_3[i]))