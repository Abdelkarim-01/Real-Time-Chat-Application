export const messages = [
    {
        id: 'msg1',
        content: 'Hello',
        time: new Date(2024, 7, 31, 9, 30), // 1st August 2024, 9:30 AM
        incoming: true
    },
    {
        id: 'msg1lite',
        content: 'How are you?',
        time: new Date(2024, 8, 1, 9, 30), // 1st August 2024, 9:30 AM
        incoming: true
    },
    {
        id: 'msg2',
        content: 'I am good, thank you! How about you?',
        time: new Date(2024, 8, 1, 9, 31), // 1st August 2024, 9:31 AM
        incoming: false
    },
    {
        id: 'msg3',
        content: 'I am doing well, just busy with work.',
        time: new Date(2024, 8, 1, 9, 32), // 1st August 2024, 9:32 AM
        incoming: true
    },
    {
        id: 'msg4',
        content: 'I understand, work has been hectic here as well.',
        time: new Date(2024, 8, 1, 9, 35), // 1st August 2024, 9:35 AM
        incoming: false
    },
    {
        id: 'msg5',
        content: 'Do you have any plans for the weekend?',
        time: new Date(2024, 8, 1, 9, 36), // 1st August 2024, 9:36 AM
        incoming: true
    },
    {
        id: 'msg6',
        content: 'Not yet, probably just relax and maybe catch a movie. You?',
        time: new Date(2024, 8, 1, 9, 38), // 1st August 2024, 9:38 AM
        incoming: false
    },
    {
        id: 'msg7',
        content: 'I might go hiking if the weather is good.',
        time: new Date(2024, 8, 1, 9, 40), // 1st August 2024, 9:40 AM
        incoming: true
    },
    {
        id: 'msg8',
        content: 'That sounds fun! Hope the weather holds up.',
        time: new Date(2024, 8, 1, 9, 42), // 1st August 2024, 9:42 AM
        incoming: false
    },
    {
        id: 'msg9',
        content: 'Thanks! Any recommendations for good movies to watch?',
        time: new Date(2024, 8, 1, 9, 45), // 1st August 2024, 9:45 AM
        incoming: true
    },
    {
        id: 'msg10',
        content: 'Sure, have you seen the latest action thriller? It\'s pretty good.',
        time: new Date(2024, 8, 1, 9, 50), // 1st August 2024, 9:50 AM
        incoming: false
    },
    {
        id: 'msg11',
        content: 'No, I haven\'t. I\'ll check it out. Thanks!',
        time: new Date(2024, 8, 1, 9, 55), // 1st August 2024, 9:55 AM
        incoming: true
    },
    {
        id: 'msg12',
        content: 'You\'re welcome! Have a great day!',
        time: new Date(2024, 8, 1, 10, 0), // 1st August 2024, 10:00 AM
        incoming: false
    },
    {
        id: 'msg7t',
        content: 'I might go hiking if the weather is good.',
        time: new Date(2024, 8, 1, 9, 40), // 1st August 2024, 9:40 AM
        incoming: true
    },
    {
        id: 'msg8t',
        content: 'That sounds fun! Hope the weather holds up.',
        time: new Date(2024, 8, 1, 9, 42), // 1st August 2024, 9:42 AM
        incoming: false
    },
    {
        id: 'msg9t',
        content: 'Thanks! Any recommendations for good movies to watch?',
        time: new Date(2024, 8, 1, 9, 45), // 1st August 2024, 9:45 AM
        incoming: true
    },
    {
        id: 'msg10t',
        content: 'Sure, have you seen the latest action thriller? It\'s pretty good.',
        time: new Date(2024, 8, 1, 9, 50), // 1st August 2024, 9:50 AM
        incoming: false
    },
    {
        id: 'msg11t',
        content: 'No, I haven\'t. I\'ll check it out. Thanks!',
        time: new Date(2024, 8, 1, 9, 55), // 1st August 2024, 9:55 AM
        incoming: true
    },
    {
        id: 'msg12t',
        content: 'You\'re welcome! Have a great day!',
        time: new Date(2024, 8, 1, 10, 0), // 1st August 2024, 10:00 AM
        incoming: false
    }
];


export const users = [
    {
        id: 'user1',
        isRoom:true,
        roomName:'football friends',
        firstName: null,
        lastName: null,
        biography: 'fuck around find out',
        status: null,
        lastSeen: null
    },
    {
        id: 'user2',
        firstName: 'Pitter',
        lastName: 'Been',
        biography: 'hello, it\'s me',
        status: 'offline',
        lastSeen: new Date(2024, 8, 8, 10, 30, 0)
    },
    {
        id: 'user3',
        firstName: 'Anna',
        lastName: 'Smith',
        biography: 'Love to travel and cook',
        status: 'online',
        lastSeen: null
    },
    {
        id: 'user4',
        firstName: 'John',
        lastName: 'Doe',
        biography: 'Web developer',
        status: 'offline',
        lastSeen: new Date(2024, 8, 7, 14, 0, 0)
    },
    {
        id: 'user5',
        firstName: 'Mary',
        lastName: 'Johnson',
        biography: 'Bookworm and coffee lover',
        status: 'online',
        lastSeen: null
    },
    {
        id: 'user6',
        firstName: 'Michael',
        lastName: 'Brown',
        biography: 'Fitness enthusiast',
        status: 'offline',
        lastSeen: new Date(2023, 6, 20, 18, 15, 0)
    },
    {
        id: 'user7',
        firstName: 'Linda',
        lastName: 'Davis',
        biography: 'Artist and musician',
        status: 'online',
        lastSeen: null
    },
    {
        id: 'user8',
        firstName: 'James',
        lastName: 'Wilson',
        biography: 'Tech geek',
        status: 'offline',
        lastSeen: new Date(2023, 5, 10, 9, 45, 0)
    },
    {
        id: 'user9',
        firstName: 'Patricia',
        lastName: 'Martinez',
        biography: 'Fashion designer',
        status: 'online',
        lastSeen: null
    },
    {
        id: 'user10',
        firstName: 'Robert',
        lastName: 'Garcia',
        biography: 'Sports fan',
        status: 'offline',
        lastSeen: new Date(2023, 4, 25, 7, 30, 0)
    },
    {
        id: 'user11',
        firstName: 'Barbara',
        lastName: 'Rodriguez',
        biography: 'Gardener and nature lover',
        status: 'online',
        lastSeen: null
    },
    {
        id: 'user12',
        firstName: 'Daniel',
        lastName: 'Martinez',
        biography: 'Photographer',
        status: 'offline',
        lastSeen: new Date(2023, 3, 12, 11, 0, 0)
    },
    {
        id: 'user13',
        firstName: 'Susan',
        lastName: 'Hernandez',
        biography: 'Chef and food critic',
        status: 'online',
        lastSeen: null
    },
    {
        id: 'user14',
        firstName: 'Thomas',
        lastName: 'Lopez',
        biography: 'Blogger and writer',
        status: 'offline',
        lastSeen: new Date(2023, 2, 15, 16, 30, 0)
    },
    {
        id: 'user15',
        firstName: 'Karen',
        lastName: 'Gonzalez',
        biography: 'Dancer and choreographer',
        status: 'online',
        lastSeen: null
    },
    {
        id: 'user16',
        firstName: 'William',
        lastName: 'Perez',
        biography: 'Cyclist and adventurer',
        status: 'offline',
        lastSeen: new Date(2023, 1, 8, 20, 0, 0)
    },
    {
        id: 'user17',
        firstName: 'Jessica',
        lastName: 'Wilson',
        biography: 'Movie buff',
        status: 'online',
        lastSeen: null
    }
];

