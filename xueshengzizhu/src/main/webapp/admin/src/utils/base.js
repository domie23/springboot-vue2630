const base = {
    get() {
        return {
            url : "http://localhost:8080/xueshengzizhu/",
            name: "xueshengzizhu",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xueshengzizhu/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "学生资助管理系统"
        } 
    }
}
export default base
