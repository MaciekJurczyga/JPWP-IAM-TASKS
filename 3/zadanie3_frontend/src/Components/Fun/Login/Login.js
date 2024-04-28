// login.js

export const login = async (userData) => {
    try {
        const response = await fetch('http://localhost:8080/api/users/login', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(userData),
        });

        if (!response.ok) {
            throw new Error('Login failed');
        }

        const data = await response.json();
        alert('Zalogowano!');
        return data;
    } catch (error) {
        throw new Error(error.message);
    }
};
