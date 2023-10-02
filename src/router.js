import { createRouter, createWebHistory } from 'vue-router';
import TheWelcome from "@/components/TheWelcome.vue";
import ResultTab from "@/components/ResultTab.vue";

const routes = [
    {
        path: '/',
        component: TheWelcome
    },
    {
        path: '/test',
        component: ResultTab
    }
    // Ajoutez d'autres routes ici au besoin
];

const router = createRouter({
    history: createWebHistory(),
    routes
});

export default router;
