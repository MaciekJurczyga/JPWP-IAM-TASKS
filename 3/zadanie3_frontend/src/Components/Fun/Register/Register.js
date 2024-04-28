// register.js
import axios from 'axios';

export const register = async (userData) => {
    try {
        const response = await axios.post('http://localhost:8080/api/users/register', userData, {
            headers: {
                'Content-Type': 'application/json',
            },
        });

        if (response.status !== 200) {
            throw new Error('Registration failed');
        }

        return response.data;
    } catch (error) {
        throw new Error(error.message);
    }
};
