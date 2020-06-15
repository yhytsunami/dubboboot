package boot.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;

/**
 * Created By yhytsunami
 * Date: 2020/4/28
 * Time: 12:19
 * Description:
 */
@WebFilter(urlPatterns = "/*", filterName = "callbackFilter")
public class JsonpResponseFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletResponseWrapper resWrapper = (HttpServletResponseWrapper) servletResponse;

    }

    @Override
    public void destroy() {

    }
}
