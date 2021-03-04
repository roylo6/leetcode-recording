"""
@Create Time : 2021/3/3 17:25
@Author      : luotaifu
"""
def select_sort(num_list):
    """
    选择排序
    :param num_list:
    :return:
    """
    n = 0
    while n < len(num_list):
        j = 0
        min_num = float('inf')
        for i in range(n, len(num_list)):
            if num_list[i] < min_num:
                min_num = num_list[i]
                j = i
        tmp = num_list[n]
        num_list[n] = min_num
        num_list[j] = tmp
        n += 1
    return num_list


def bubble_sort(num_list):
    """
    冒泡排序
    :param num_list:
    :return:
    """
    n = len(num_list)
    while n >= 1:
        for i in range(n - 1):
            cur_num = num_list[i]
            if cur_num > num_list[i + 1]:
                num_list[i] = num_list[i + 1]
                num_list[i + 1] = cur_num
        n -= 1
    return num_list


def insertion_sort(num_list):
    """
    插入排序
    :param num_list:
    :return:
    """
    sorted_index = 1
    while sorted_index < len(num_list):
        for j in range(sorted_index):
            if num_list[j] > num_list[sorted_index]:
                sorted_num = num_list[j]
                num_list[j] = num_list[sorted_index]
                num_list[sorted_index] = sorted_num
        sorted_index += 1
    return num_list


def run():
    num_list = [3, 7, 2, 4, 9, 10, 6, 8, 5, 0, -4]
    print(select_sort(num_list))
    print(bubble_sort(num_list))
    print(insertion_sort(num_list))


if __name__ == '__main__':
    run()
