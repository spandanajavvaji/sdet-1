user1 = input('enetr user1 name: ')
user2 = input('enetr user2 name: ')
while True:
    user1_answer = input(user1 + ' do you want to choose rock, paper or scissor? ' ).lower()
    user2_answer = input(user2 + ' do you want to choose rock, paper or scissor? ' ).lower()
    if user1_answer == user2_answer:
        print('its a tie')
    elif user1_answer == 'paper':
        if user2_answer == 'rock':
            print('Paper wins!')
        else:
            print('Scissor wins!')
    elif user1_answer == 'rock':
        if user2_answer == 'scissor':
            print('Rock wins!')
        else:
            print('Paper wins!')
    elif user1_answer == 'scissor':
        if user2_answer == 'paper':
            print('Scissor wins!')
        else:
            print('Rock wins!')
    else:
        print('Invalid input! You have not entered rock, paper or scissors, please try again.').lower()
    repeat = input('do you want to play another round? Yes/no: ')
    if (repeat == 'yes'):
        pass
    elif (repeat == 'no'):
        raise SystemExit
    else:
        print('you have entered an invalid input. exiting now...')
        raise SystemExit
        